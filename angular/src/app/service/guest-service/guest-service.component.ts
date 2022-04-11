import { Component, OnInit } from '@angular/core';
import { AppServiceService } from 'src/app/app-service.service';

@Component({
  selector: 'app-guest-service',
  templateUrl: './guest-service.component.html',
  styleUrls: ['./guest-service.component.css']
})
export class GuestServiceComponent implements OnInit {
  guests:any
  constructor(private guestservice:AppServiceService) {
    guestservice.getguest().subscribe((data)=>this.guests=data);
   }

  ngOnInit(): void {
  }
  deleteguest(code:any)
  {
    this.guestservice.deleteguest(code).subscribe((res:any)=>console.log(res));
  }
}
