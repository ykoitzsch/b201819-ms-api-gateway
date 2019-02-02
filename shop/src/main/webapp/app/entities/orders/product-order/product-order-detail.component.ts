import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { IProductOrder } from 'app/shared/model/orders/product-order.model';

@Component({
    selector: 'jhi-product-order-detail',
    templateUrl: './product-order-detail.component.html'
})
export class ProductOrderDetailComponent implements OnInit {
    productOrder: IProductOrder;

    constructor(private activatedRoute: ActivatedRoute) {}

    ngOnInit() {
        this.activatedRoute.data.subscribe(({ productOrder }) => {
            this.productOrder = productOrder;
        });
    }

    previousState() {
        window.history.back();
    }
}
