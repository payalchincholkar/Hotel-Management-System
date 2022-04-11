import { AuthenticatesGuard } from './authenticates.guard';
import { AdminComponent } from './admin/admin.component';
import { LoginComponent } from './enduser/login/login.component';
import { ManagerComponent } from './enduser/manager/manager.component';
import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MainPageComponent } from './enduser/main-page/main-page.component';
import { OwnerComponent } from './enduser/owner/owner.component';
import { ReceptionistComponent } from './enduser/receptionist/receptionist.component';
import { StaffServiceComponent } from './enduser/staff-service/staff-service.component';
import { ReservationServiceComponent } from './service/reservation-service/reservation-service.component';
import { GuestServiceComponent } from './service/guest-service/guest-service.component';
import { RoomServiceComponent } from './service/room-service/room-service.component';
import { InventoryServiceComponent } from './service/inventory-service/inventory-service.component';
import { StaffFormComponent } from './addstaffservice/staff-form/staff-form.component';
import { RoomFormComponent } from './addroomservice/room-form/room-form.component';
import { InventoryFormComponent } from './addinventoryservice/inventory-form/inventory-form.component';
import { ReservationFormComponent } from './addreservationservice/reservation-form/reservation-form.component';
import { UpdatestaffComponent } from './updatestaff/updatestaff.component';
import { DeaprtmentServiceComponent } from './service/deaprtment-service/deaprtment-service.component';
import { SignupComponent } from './signup/signup.component';
import { FullReportComponent } from './full-report/full-report.component';
import { GuestFormComponent } from './guest-form/guest-form.component';
import { PaymentFormComponent } from './payment-form/payment-form.component';
import { GuestComponent } from './guest/guest.component';

const routes: Routes = [
  {
  path:'',
  component:MainPageComponent
  },
  {
    path:'login',
    component:LoginComponent
  },
  {
    path:'signup',
    component:SignupComponent

  },
  {path:'',component:MainPageComponent},
   {
       path:'admin',      
      children:[
         
         { path:'manager',
           canActivate:[AuthenticatesGuard],
             children:[
               {path:'staff-service',component:StaffServiceComponent},
               {path:'room-service', component:RoomServiceComponent},
               {path:'inventory-service', component:InventoryServiceComponent},
               {path:'addstaff',component:StaffFormComponent},
               {path:'addroom',component:RoomFormComponent},
               {path:'updatestaff/:code',component:UpdatestaffComponent},
               {path:'addinventory',component:InventoryFormComponent},

             ],
         component:ManagerComponent},
         { path:'receptionist',
         canActivate:[AuthenticatesGuard],
         children:[
           {path:'guest',
             children:[
            {path:'guest-service',component:GuestServiceComponent},
            {path:'guest-form',component:GuestFormComponent},
             {path:'payment',component:PaymentFormComponent}
           ],
           component:GuestComponent },
           {path:'reservation-service',component:ReservationServiceComponent},
           {path:'addreservation',component:ReservationFormComponent},
         ],
          component:ReceptionistComponent},
         { path:'owner', 
         canActivate:[AuthenticatesGuard],
         children:[
           {path:'department-service',component:DeaprtmentServiceComponent},
           { path:'full-report',component:FullReportComponent},
         ],
         component:OwnerComponent}
   ],
      component:AdminComponent
   }

  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
