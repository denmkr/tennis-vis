import { Component, OnInit } from '@angular/core';

import { DataService } from './data.service';

@Component({
  selector: 'app-vis-block',
  templateUrl: './vis-block.component.html',
  styleUrls: ['./vis-block.component.css']
})
export class VisBlockComponent implements OnInit {

  constructor(private dataService: DataService) { }

  ngOnInit() {
  	this.showDealsByPage();
  }

  showDealsByPage() {
    this.dataService.getBallPositions().subscribe(
      result => console.log(result)
    );
  }

}
