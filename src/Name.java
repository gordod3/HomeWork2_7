public class Name implements Comparable<Name> {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Name o) {
        return this.name.length() - o.getName().length();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
