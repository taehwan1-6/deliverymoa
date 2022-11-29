package inu.deliverymoa.common.exception;

public class NotFoundException extends RuntimeException {
    public static final String USER_NOT_FOUND = "존재하지 않는 회원입니다.";
    public static final String CATEGORY_NOT_FOUND = "존재하지 않는 카테고리입니다.";
    public static final String CHAT_ROOM_NOT_FOUND = "존재하지 않는 채팅방입니다.";

    public NotFoundException(String message) {
        super(message);
    }
}