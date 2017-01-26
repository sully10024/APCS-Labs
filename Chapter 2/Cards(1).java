// ****************************************************************************************************
// Cards.java
// Author: Clay Sullivan
// Date: 10-14-14
// Summary: Prints some stuff using lots of really confusing methods of Enum class
// ****************************************************************************************************

public class Cards
{
    enum Rank {ace, two, three, four, five, six, seven,
        eight, nine, ten, jack, queen, king}
    
    public static void main(String[] args)
    {
        // creates variables highCard, faceCard, card1, and card2 of type Rank
        Rank highCard, faceCard, card1, card2;
        
        // defines highCard and faceCard as the name of the ace object and the queen object
        highCard = Rank.ace;
        faceCard = Rank.queen;
        
        // defines card1 and card2 as the names of the three object and the seven object
        card1 = Rank.three;
        card2 = Rank.seven;
        
        // defines two intigers as the face values of card1 and
        //     card2, neither of which are used later on
        int card1Val = 3;
        int card2Val = 7;    
        
        // prints some stuff about your blackjack hand with the names of highCard and faceCard
        //     as well as some other information about your hand
        System.out.println("A blackjack hand: " + highCard.name() + " and " + faceCard.name());
        System.out.println("A two card hand: " + card1.name() + " and " + card2.name());
        System.out.print("Hand value: " + (card1.ordinal() + card2.ordinal() + 2));
    }
}