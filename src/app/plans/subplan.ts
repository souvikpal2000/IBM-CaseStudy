export class SubPlan{
    public constructor(public planid:number, public duration: number, public price: number, public name: string){
        this.planid = planid;
        this.duration = duration;
        this.price = price;
        this.name = name;
    }
}