import { Member } from "app/member/member";
import { SubPlan } from "app/plans/subplan";

export class MemberSubscription{
    public constructor( public subscription_id:number, public member: Member, public subPlan: SubPlan,
                        public date:number, public status: string){
        
        this.subscription_id = subscription_id;
        this.member = member;
        this.subPlan = subPlan;
        this.date = date;
        this.status = status;
    }
}