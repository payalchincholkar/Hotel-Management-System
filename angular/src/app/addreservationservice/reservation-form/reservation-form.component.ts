import { Component, OnInit } from '@angular/core';
import { AppServiceService } from 'src/app/app-service.service';

@Component({
  selector: 'app-reservation-form',
  templateUrl: './reservation-form.component.html',
  styleUrls: ['./reservation-form.component.css']
})
export class ReservationFormComponent implements OnInit {

  constructor(private addreservation: AppServiceService) { }
  user = {
    code: "",
    numberOfChildren: "",
    numberOfAdults: "",
    checkInDate: "",
    checkOutDate: "",
    status: "",
    numberOfNights: ""

  };
  ngOnInit(): void {
  }
  onSubmit(data: any) {
    this.user = data;
    console.log(this.user);

    this.addreservation.insertreservation(this.user)
      .subscribe((res: any) => { console.log(res); }

      );
  }

}

