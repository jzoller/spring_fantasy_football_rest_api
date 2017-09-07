package org.jzoller.fantfb.api.jzollerfantfbapi.Player;

import org.jzoller.fantfb.api.jzollerfantfbapi.Team.Team;

import javax.persistence.*;

/**
 * Created by jasonzoller on 9/7/17.
 */

@Entity
@Table(name="Player")
public class Player {

    @Id
    @Column(name="player_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name="team_id")
    private Team team;

    @Column(name="number")
    private int number; //refers to jersey number to avoid confusion from same names

    @Column(name="rb_eligible")
    private boolean rbEligible;

    @Column(name="wr_eligible")
    private boolean wrEligible;

    @Column(name="qb_eligible")
    private boolean qbEligible;

    @Column(name="te_eligible")
    private boolean teEligible;

    @Column(name="k_eligible")
    private boolean kEligible;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isRbEligible() {
        return rbEligible;
    }

    public void setRbEligible(boolean rbEligible) {
        this.rbEligible = rbEligible;
    }

    public boolean isWrEligible() {
        return wrEligible;
    }

    public void setWrEligible(boolean wrEligible) {
        this.wrEligible = wrEligible;
    }

    public boolean isQbEligible() {
        return qbEligible;
    }

    public void setQbEligible(boolean qbEligible) {
        this.qbEligible = qbEligible;
    }

    public boolean isTeEligible() {
        return teEligible;
    }

    public void setTeEligible(boolean teEligible) {
        this.teEligible = teEligible;
    }

    public boolean iskEligible() {
        return kEligible;
    }

    public void setkEligible(boolean kEligible) {
        this.kEligible = kEligible;
    }
}
