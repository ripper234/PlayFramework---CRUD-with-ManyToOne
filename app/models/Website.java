package models;

import play.data.validation.Required;
import play.data.validation.URL;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Website extends Model {
    public String url;

    public Date created;

    @OneToMany
    public List<SiteConfigRow> config;
}
