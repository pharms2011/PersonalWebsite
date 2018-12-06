import { DevBlogLink } from "./DevBlogLink";

export class DevBlogEntry{
   devBlogEntryId : Number;
   devBlogEntry : String;
   entryDate : Date;
   published : String;
   title : String;
   links : DevBlogLink[];
}