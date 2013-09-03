package info.lotharschulz.cucumber.test;

public class MyString {

    private String content;

    public MyString(String content) {
        this.setString(content);
    }

    public MyString() {
    }

    public String addSuffixString(String suffix) {
        return this.content.concat("_").concat(suffix);
    }

    public String addPrefixString(String prefix) {
        return prefix.concat("_").concat(this.content);
    }

    public void setString(String content) {
        this.content = content;
    }

}
