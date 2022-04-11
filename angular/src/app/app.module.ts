import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './enduser/login/login.component';
import { ManagerComponent } from './enduser/manager/manager.component';
import { MainPageComponent } from './enduser/main-page/main-page.component';
import { HeaderComponent } from './enduser/header/header.component';
import { OwnerComponent } from './enduser/owner/owner.component';
import { ReceptionistComponent } from './enduser/receptionist/receptionist.component';
import {HttpClientModule} from '@angular/common/http';
import { StaffServiceComponent } from './enduser/staff-service/staff-service.component';
import { FormsModule } from '@angular/forms';
import { ReservationServiceComponent } from './service/reservation-service/reservation-service.component';

import { GuestServiceComponent } from './service/guest-service/guest-service.component';
import { RoomServiceComponent } from './service/room-service/room-service.component';
import { InventoryServiceComponent } from './service/inventory-service/inventory-service.component';
import { StaffFormComponent } from './addstaffservice/staff-form/staff-form.component';
import { RoomFormComponent } from './addroomservice/room-form/room-form.component';
import { InventoryFormComponent } from './addinventoryservice/inventory-form/inventory-form.component';
import { ReservationFormComponent } from './addreservationservice/reservation-form/reservation-form.component';
import {MatDialogModule} from '@angular/material/dialog';
import { AdminComponent } from './admin/admin.component';
import { UpdatestaffComponent } from './updatestaff/updatestaff.component';
import { DeaprtmentServiceComponent } from './service/deaprtment-service/deaprtment-service.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule} from "@angular/material/button";
import { DashboardComponent } from './enduser/dashboard/dashboard.component';
import { SignupComponent } from './signup/signup.component';
import { FullReportComponent } from './full-report/full-report.component';
import { PaymentFormComponent } from './payment-form/payment-form.component';
import { GuestComponent } from './guest/guest.component'
import { GuestFormComponent } from './guest-form/guest-form.component';
import {ReactiveFormsModule} from '@angular/forms'
import {MatTooltipModule} from '@angular/material/tooltip';
import {MatFormFieldModule} from '@angular/material/form-field';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ManagerComponent,
    MainPageComponent,
    HeaderComponent,
    OwnerComponent,
    ReceptionistComponent,
    StaffServiceComponent,
    ReservationServiceComponent,
    GuestServiceComponent,
    RoomServiceComponent,
    InventoryServiceComponent,
    StaffFormComponent,
    RoomFormComponent,
    InventoryFormComponent,
    ReservationFormComponent,
    AdminComponent,
    UpdatestaffComponent,
    DeaprtmentServiceComponent,
    DashboardComponent,
    SignupComponent,
    FullReportComponent,
    PaymentFormComponent,
    GuestComponent,
    GuestFormComponent,
  
    

  
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatDialogModule,
    MatTooltipModule,
    MatFormFieldModule
  
  ],
 
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
