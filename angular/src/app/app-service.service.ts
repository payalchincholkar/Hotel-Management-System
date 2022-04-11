import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { StaffEntity } from './staff';

function _window() : any {
  
  return window;
}

@Injectable({
  providedIn: 'root'
})
export class AppServiceService {
  get nativeWindow() : any {
    return _window();
 }
  constructor(private http:HttpClient) { }
  Staff= "http://localhost:8085/staff/";
  Reservation= "http://localhost:8086/reservation/";
  guest="http://localhost:8086/guest/";
  room="http://localhost:8085/room/";
  inventry="http://localhost:8085/inventory/";
  depart="http://localhost:8091/manageDepartment/";
  auth="http://localhost:8090/";
  transaction="http://localhost:8094/";


  

  getStaff(){
    return this.http.get(this.Staff+"view");
    
  }
  getReservation()
  {
    return this.http.get(this.Reservation+"view");
  }
  getguest()
  {
    return this.http.get(this.guest+"get");
  }
  getroom()
  {
    return this.http.get(this.room+"get");
  }
  getdepart()
  {
    return this.http.get(this.depart+"getDepartment");
  }
  getinventory()
  {
    return this.http.get(this.inventry+"get");
  }
  insertstaff(data:any):Observable<any>
  {
    return this.http.post(this.Staff+"insert",data);
  }
  
  insertroom(data:any):Observable<any>
  {
    return this.http.post(this.room+"add",data);
  }
  insertinventory(data:any):Observable<any>
  {
    return this.http.post(this.inventry+"add",data);
  }
  insertreservation(data:any):Observable<any>
  {
    return this.http.post(this.Reservation+"add",data);
  }
 
  deletestaff(data:any):Observable<any>
  {
    return this.http.delete(this.Staff+"delete/"+data);
  }
  deletedepart(data:any):Observable<any>
  {
    return this.http.delete(this.depart+"deleteDepartment/"+data);
  }
  deleteinventory(data:any):Observable<any>
  {
    return this.http.delete(this.inventry+"delete/"+data);
  }
  deleteroom(data:any):Observable<any>
  {
    return this.http.delete(this.room+"deleteroom/"+data);
  }
  deleteguest(data:any):Observable<any>
  {
    return this.http.delete(this.guest+"delete/"+data);
  }
  getstaffById(code:String):Observable<StaffEntity>{
    return this.http.get<StaffEntity>(this.Staff+"view/"+code);
  }
  updatestaff(code:String,updatestaff: StaffEntity):Observable<Object>{
    return this.http.put(this.Staff+"update/"+code,updatestaff);
  }
  authreg(data:any)
  {
  return this.http.post(this.auth+"subs",data);
  }
  authcheack(data:any)
  {
    return this.http.post(this.auth+"auth",data);
  }
  tnscreate(data:any)
  {
    return this.http.post(this.transaction+"create",data);
  }
  insertguest(data:any)
  {
    return this.http.post(this.guest+"insert",data);
  }
  }
