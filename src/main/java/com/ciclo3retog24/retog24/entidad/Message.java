package com.ciclo3retog24.retog24.entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idMessage;
    private String messageText;

    @ManyToOne
    @JoinColumn(name="messages")
    @JsonIgnoreProperties("messages")
    private Client client;

}
