import { Component, OnInit } from '@angular/core';
import { AppServiceService } from 'src/app/app-service.service';

@Component({
  selector: 'app-reservation-service',
  templateUrl: './reservation-service.component.html',
  styleUrls: ['./reservation-service.component.css']
})
export class ReservationServiceComponent implements OnInit {
  reservations:any;
  constructor(private reservationservice:AppServiceService ) { 
    this.reservationservice.getReservation().subscribe((data)=>{
      console.log(data);
      
      this.reservations=data});
  }

  ngOnInit(): void {
    
  }

}
