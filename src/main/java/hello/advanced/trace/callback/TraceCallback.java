package hello.advanced.trace.callback;

/**
 * 콜백을 전달하는 인터페이스
 * 반환 타입이 상황에 따라 다르므로 제네릭으로 선언
 */
public interface TraceCallback<T> {
    T call();
}
