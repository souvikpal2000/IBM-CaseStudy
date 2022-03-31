export class Member{
    public constructor( public userid: string, public password: string, public firstname: string,
                        public lastname: string, public emailid: string, public phone: number,
                        public user_role: string){
        
        this.userid = userid;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailid = emailid;
        this.phone = phone;
        this.user_role = user_role;
    }
}