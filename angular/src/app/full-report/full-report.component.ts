import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppServiceService } from '../app-service.service';

@Component({
  selector: 'app-full-report',
  templateUrl: './full-report.component.html',
  styleUrls: ['./full-report.component.css']
})
export class FullReportComponent implements OnInit {

  staffs:any
  rooms:any
  inventories:any
  guests:any
  reservations:any
  constructor(private staffservice:AppServiceService,
    private router:Router) {
  
  staffservice.getStaff().subscribe((data)=>this.staffs=data);
  staffservice.getroom().subscribe((data)=>this.rooms=data);
  staffservice.getinventory().subscribe((data)=>this.inventories=data);
  staffservice.getguest().subscribe((data)=>this.guests=data);
  staffservice.getReservation().subscribe((data)=>this.reservations=data);
   }
  ngOnInit(): void {
    
     
  }

}