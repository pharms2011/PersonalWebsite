import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hexagons',
  templateUrl: './hexagons.component.html',
  styleUrls: ['./hexagons.component.css']
})
export class HexagonsComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    const hue = ~~(.5*360)
  document.body.style.background = `radial-gradient(
  hsl(${hue}, 85%, 20%) 1%, 
  hsl(${hue + 30 + ~~(.90*30)}, 85%, 20%)
  )`

  }
}
