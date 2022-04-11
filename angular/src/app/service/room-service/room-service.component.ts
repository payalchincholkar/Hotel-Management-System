import { Component, OnInit } from '@angular/core';
import { AppServiceService } from 'src/app/app-service.service';

@Component({
  selector: 'app-room-service',
  templateUrl: './room-service.component.html',
  styleUrls: ['./room-service.component.css']
})
export class RoomServiceComponent implements OnInit {
  rooms:any;
  constructor(private roomservice:AppServiceService) { 
  this.roomservice.getroom().subscribe((data)=>this.rooms=data)
  }
  ngOnInit(): void {
  }
   deleteroom(code:any)
   {
    this.roomservice.deleteroom(code).subscribe((res:any)=>console.log(res));
   }
}
