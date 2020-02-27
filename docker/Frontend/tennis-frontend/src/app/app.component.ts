import { Component, ViewChild, OnInit } from '@angular/core';

import { VisBlockComponent } from './vis-block/vis-block.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'tennis-frontend';
  @ViewChild(VisBlockComponent, {static: false}) visBlockComponent: VisBlockComponent;

  ngOnInit() { }
}
