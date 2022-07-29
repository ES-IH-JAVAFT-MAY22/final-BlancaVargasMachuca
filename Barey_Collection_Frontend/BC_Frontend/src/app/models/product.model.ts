enum Category{
    NEW_IN= "NEW_IN",
    TOPS = "TOPS",
    JACKETS= "JACKETS",
    SKIRTS= "SKIRTS",
    TROUSERS= "TROUSERS",
    VESTS= "VESTS",
    DRESSES= "DRESSES"

}

enum Size{
    XS = "XS",
    S= "S",
    M= "M",
    L= "L"
}



export class Product {
   
    constructor(
     private _reference: number,
     private _name: string,
     private _price: BigInt,
     private _description: string,
     private _size: Size,
     private _categoy: Category,
     private _image: string,
     
     ) {}

     public get reference(): number {
        return this._reference;
    }
    public set reference(value: number) {
        this._reference = value;
    }

    public get name(): string {
        return this._name;
    }
    public set name(value: string) {
        this._name = value;
    }

    public get price(): BigInt {
        return this._price;
    }
    public set price(value: BigInt) {
        this._price = value;
    }

    public get description(): string {
        return this._description;
    }
    public set description(value: string) {
        this._description = value;
    }

    public get size(): Size {
        return this._size;
    }
    public set size(value: Size) {
        this._size = value;
    }

    public get image(): string {
        return this._image;
    }
    public set image(value: string) {
        this._image = value;
    }

    public get categoy(): Category {
        return this._categoy;
    }
    public set categoy(value: Category) {
        this._categoy = value;
    }

}   
