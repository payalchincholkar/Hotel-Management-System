import { Component, OnInit } from '@angular/core';
import { AppServiceService } from 'src/app/app-service.service';

@Component({
  selector: 'app-room-form',
  templateUrl: './room-form.component.html',
  styleUrls: ['./room-form.component.css']
})
export class RoomFormComponent implements OnInit {

  constructor(private addroom:AppServiceService) { }
  user={
     rNumber:"",
		 rType:"",
	   rStatus:"",
		 rPrice:"" 
  };
  ngOnInit(): void {
  }
  onSubmit(data:any)
  {
    this.user=data;
    console.log(this.user);
    
    this.addroom.insertroom(this.user)
                  .subscribe((res:any)=>{console.log(res);}
    
    );
  }

}

