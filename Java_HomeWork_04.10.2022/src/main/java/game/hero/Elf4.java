package game.hero;

public class Elf4 {



    private String nickname;
    private int id;


    public Elf4() {
        this(0);
    }

    public String getNickname() {
        return nickname;
    }

    public Elf4 setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public Elf4(String nickname) {
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public Elf4 setId(int id) {
        this.id = id;
        return this;
    }

    public Elf4(int id) {
        this.id = id;
        System.out.println(this.id);
    }
    public Elf4(int id, String nickname){
        this(id);
        this.id = id;
        System.out.println(this.id);

    }

}

// Доброго времени суток, я пытался разобраться,как выполнить домашнее задание, но к сожалению,
// настолько сильно запутался, что не понимаю, что я делаю. Когда смотрю лекции,
// кажеться что все понтно, но вот погда приступаю к выполнению домашнего задания, полностью теряюсь.
// Как я понимаю, это все у меня из-за того, что я не совсем представляю что я делаю
// и как оно на чтото влияет. К примеру в html, я вижу то, что пишу у коде, а в java я этого не вижу.
// Вы отличный преподователь, и тут только моя вина в том, что я не понимаю. Прошу прошение.
