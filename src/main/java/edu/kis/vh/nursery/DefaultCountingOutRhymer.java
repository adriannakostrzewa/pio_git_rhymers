package edu.kis.vh.nursery;

/**
 * Klasa {@code DefaultCountingOutRhymer} implementuje prosty stos liczb całkowitych,
 * z ustaloną pojemnością. Umożliwia dodawanie, usuwanie oraz podglądanie elementów,
 * zgodnie z zasadą LIFO (Last In, First Out).
 */
public class DefaultCountingOutRhymer {

    /** Maksymalna liczba elementów, jakie może przechowywać stos. */
    private static final int STACK_CAPACITY = 12;

    /** Wartość oznaczająca pusty stos. */
    private static final int EMPTY_STACK_VALUE = -1;

    /** Indeks oznaczający, że stos jest pełny. */
    private static final int FULL_STACK_INDEX = STACK_CAPACITY - 1;

    /** Tablica przechowująca elementy stosu. */
    private final int[] numbers = new int[STACK_CAPACITY];

    /** Indeks ostatnio dodanego elementu; -1 oznacza, że stos jest pusty. */
    private int total = EMPTY_STACK_VALUE;

    /**
     * Dodaje nowy element do stosu, jeśli nie jest pełny.
     *
     * @param in wartość do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return {@code true}, jeśli stos jest pusty; {@code false} w przeciwnym razie
     */
    public boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     *
     * @return {@code true}, jeśli stos osiągnął maksymalną pojemność; {@code false} w przeciwnym razie
     */
    public boolean isFull() {
        return total == FULL_STACK_INDEX;
    }

    /**
     * Zwraca element znajdujący się na szczycie stosu bez jego usuwania.
     *
     * @return wartość na szczycie stosu lub {@code -1}, jeśli stos jest pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total];
    }

    /**
     * Usuwa i zwraca element znajdujący się na szczycie stosu.
     *
     * @return wartość ze szczytu stosu lub {@code -1}, jeśli stos jest pusty
     */
    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total--];
    }

}
