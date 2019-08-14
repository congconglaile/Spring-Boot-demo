package com.example.card.service;

import com.example.card.bean.Card;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardService {

    /**
     * Get Cards By Id
     * @param personId
     * @return Cards
     */
    public List getCardListById(String personId) {
        List list = new ArrayList<Card>();
        Card card1 = new Card();
        card1.setAvailableLimit((float) 35400.26);
        card1.setCardId("6217****3038");
        card1.setLimit((float) 40000.00);
        card1.setMaxLimit((float) 45000.00);
        card1.setName("Coles Rewards MasterCard");
        card1.setNewLimit((float) 45000.00);
        list.add(card1);
        Card card2 = new Card();
        card2.setAvailableLimit((float) 800.50);
        card2.setCardId("6212****9835");
        card2.setLimit((float) 30000.00);
        card2.setMaxLimit((float) 40000.00);
        card2.setName("Coles Rewards MasterCard");
        card2.setNewLimit((float) 40000.00);
        list.add(card2);
        return list;
    }

    public void updateCard(Card card) {
        //TODO
    }

}
