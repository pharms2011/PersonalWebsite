import { PerBlogPic } from "./PerBlogPic";

export class PerBlogEntry{
    perBlogEntryId : Number;
    perBlogEntry : String;
    published : String;
    pictures : PerBlogPic[];
    selectedImg : PerBlogPic;
}