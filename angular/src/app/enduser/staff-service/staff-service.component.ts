import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppServiceService } from 'src/app/app-service.service';

@Component({
  selector: 'app-staff-service',
  templateUrl: './staff-service.component.html',
  styleUrls: ['./staff-service.component.css']
})
export class StaffServiceComponent implements OnInit {

  staffs:any
  constructor(private staffservice:AppServiceService,
    private router:Router) {
  
  staffservice.getStaff().subscribe((data)=>this.staffs=data);
   }
  ngOnInit(): void {
    
     
  }
  deletestaff(code:any)
  {
    this.staffservice.deletestaff(code).subscribe((res:any)=>console.log(res));
  }
  update(code:string){
    this.router.navigate(['admin/manager/updatestaff',code]);
  }

}
