export class Order {
   

    constructor(
     private _numberOrder: number,
     private _nameClient: string,
     private _dateOrder: Date,
     private _dateDelivery: Date,
     private _pickupTime: number,
     private _Address: string,
     private _userId: number
     ) {}
   
    
    public get numberOrder(): number {
        return this._numberOrder;
    }
    public set numberOrder(value: number) {
        this._numberOrder = value;
    }

    public get nameClient(): string {
        return this._nameClient;
    }
    public set nameClient(value: string) {
        this._nameClient = value;
    }

    public get dateOrder(): Date {
        return this._dateOrder;
    }
    public set dateOrder(value: Date) {
        this._dateOrder = value;
    }

    public get dateDelivery(): Date {
        return this._dateDelivery;
    }
    public set dateDelivery(value: Date) {
        this._dateDelivery = value;
    }

    public get pickupTime(): number {
        return this._pickupTime;
    }
    public set pickupTime(value: number) {
        this._pickupTime = value;
    }

    public get Address(): string {
        return this._Address;
    }
    public set Address(value: string) {
        this._Address = value;
    }

    public get userId(): number {
        return this._userId;
    }
    public set userId(value: number) {
        this._userId = value;
    }
     
}
