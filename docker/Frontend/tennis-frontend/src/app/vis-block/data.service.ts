import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  constructor(private http: HttpClient) { }

  getBallPositions() {
	let httpParams = new HttpParams();

	return this.http.get<any>("http://localhost:8080/api/v1/balls", { params: httpParams, reportProgress: true });
  }
}
