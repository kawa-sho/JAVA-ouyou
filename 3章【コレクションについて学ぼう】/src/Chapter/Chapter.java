package Chapter;
import java.util.ArrayList;
import java.util.List;

public class Chapter {

    public static void main(String[] args) {
        List<Character> party = new ArrayList<Character>();
        // プログラムを作成
        party.add(new Soldier());
        party.add(new Playboy());

        Chapter.partyAttack(party);
    }

    public static void partyAttack(List<Character> party) {
        for (Character character : party) {
            int hp = character.attack();
            System.out.println("ヒットポイント：" + hp);
        }
    }
}