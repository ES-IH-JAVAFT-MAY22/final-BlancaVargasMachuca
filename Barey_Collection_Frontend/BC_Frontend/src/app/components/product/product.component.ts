import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/models/product.model';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

   //reference: number;
   //name: string;
   //price: BigInt;
   //description: string;
   //size: Size;
   //category: Category;
   //image: string

  constructor() { }

  ngOnInit(): void {
  }

}

