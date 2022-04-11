import { Component, OnInit } from '@angular/core';
import { AppServiceService } from 'src/app/app-service.service';

@Component({
  selector: 'app-inventory-service',
  templateUrl: './inventory-service.component.html',
  styleUrls: ['./inventory-service.component.css']
})
export class InventoryServiceComponent implements OnInit {
  inventories:any
  constructor(private inventoryservice:AppServiceService) { 
    inventoryservice.getinventory().subscribe((data)=>this.inventories=data);
  }

  ngOnInit(): void {
  }
  deleteinventory(code:any)
  {
    
    this.inventoryservice.deleteinventory(code).subscribe((res:any)=>console.log(res));
  }
}
