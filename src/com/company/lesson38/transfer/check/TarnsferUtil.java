package com.company.lesson38.transfer.check;

import com.company.lesson38.transfer.exceptions.CardNotFoundException;
import com.company.lesson38.transfer.exceptions.ExpiredCardException;
import com.company.lesson38.transfer.exceptions.InsufficientBalanceExceptions;
import com.company.lesson38.transfer.model.Card;
import java.time.LocalDate;
import java.util.List;

public class TarnsferUtil {

    public static Card checkUserCard(Integer userId, List<Card> cardList){
        for (Card card: cardList){
            if(card.getUserId()==userId){
                return card;
            }
        }
        throw  new CardNotFoundException();

    }
    public static Card checkCardExist(String  cardNumber, List<Card> cardList){
        for (Card card: cardList){
            if(card.getCardNum().equals(cardNumber)){
              if(LocalDate.now().isAfter( card.getExpireDate()))
                  throw new ExpiredCardException();
                return card;
            }
        }
        throw  new CardNotFoundException();

    }

    public static void checkBalance(Card senderCard, Double amount) {
        if (!(senderCard.getBalance()>=amount)){
            throw new InsufficientBalanceExceptions();
        }
    }
}
