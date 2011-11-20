package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class SiteConfigRow extends Model{
    @ManyToOne
    public Website site;

    public String key;
    public String value;
    public String version;
}
