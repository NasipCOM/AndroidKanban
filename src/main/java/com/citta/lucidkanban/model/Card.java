package com.citta.lucidkanban.model;

import java.io.Serializable;

public class Card implements Serializable {

 public Member member;
 public Task task;
 public Boolean isCardAssigned;
 public CardPriority cardPriority;
 public CardStatus cardStatus;


 private Card(Member member, Task task, CardPriority cardPriority,
             CardStatus cardStatus, Boolean isCardAssigned)
 {
     this.member = member;
     this.task = task;
     this.cardPriority = cardPriority;
     this.cardStatus = cardStatus;
     this.isCardAssigned = isCardAssigned;
 }

    public enum CardPriority {LOW, MEDIUM, HIGH;}
    public enum CardStatus {TODO, INPROGRESS, COMPLETED}

}

