package Trello;

import java.util.List;

public class Card {
    public String id;

    public Boolean closed;
    public Boolean dueComplete;
    public String dateLastActivity;
    public String desc;
    public String idBoard;
    public String idList;
    public List<String> idMembers;
    public Integer idShort;
    public String idAttachmentCover;
    public Boolean manualCoverAttachment;

    public List<String> idLabels;
    public String name;
    public Integer pos;
    public String shortLink;
    public String shortUrl;
    public Boolean subscribed;
    public String url;
    public String address;
    public String locationName;


    public Card() {
    }
    public Card(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "desc"+desc+"id="+id;
    }
}
