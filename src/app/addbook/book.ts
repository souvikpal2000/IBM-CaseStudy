export class Book{
    public constructor( public bid:number, public title:string, 
                        public author:string, public publisher:string, 
                        public pages:number, public category:string,
                        public description:string, public imageurl:string,
                        public pdfurl:string) {

        this.bid = bid;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        this.category = category;
        this.description = description;
        this.imageurl = imageurl;
        this.pdfurl = pdfurl;
    }
}