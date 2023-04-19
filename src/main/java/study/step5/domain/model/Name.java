package study.step5.domain.model;

import study.step5.exception.CustomException;

public class Name {
    private static final int NAME_MAX_LENGTH = 5;

    String name;

    public Name(String name) {
        checkName(name);
        this.name = name;
    }

    private void checkName(String name) {
        if (name.length() > NAME_MAX_LENGTH) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(String.format("이름이 %d 글자 이상입니다.", NAME_MAX_LENGTH));
            throw new CustomException(stringBuilder.toString());
        }
    }

    public String getName() {
        return name;
    }

}
