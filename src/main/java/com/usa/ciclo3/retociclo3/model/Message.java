package com.usa.ciclo3.retociclo3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="message")

public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String  messageText;

    @ManyToOne
    @JoinColumn(name="idQuadbike")
    @JsonIgnoreProperties({"messages", "client", "reservations"})
    private Quadbike quadbike;

    @ManyToOne
    @JoinColumn(name="idClient")
    @JsonIgnoreProperties({"messages", "client", "reservations"})
    private Client client;

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Quadbike getCabin() {
        return quadbike;
    }

    public void setCabin(Quadbike quadbike) {
        this.quadbike = quadbike;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
