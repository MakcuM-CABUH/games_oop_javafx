package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void wenPositionIsEquals() {
        Cell start = Cell.C8;
        BishopBlack bishop = new BishopBlack(start);
        assertEquals(start, bishop.position());
    }

    @Test
    void whenFigureIsCopy() {
        Cell start = Cell.C8;
        Cell dest = Cell.H3;
        BishopBlack bishop = new BishopBlack(start);
        Figure copy = bishop.copy(dest);
        assertNotSame(bishop, copy);
        assertEquals(dest, copy.position());
    }

    @Test
    public void whenWayIsEquals() {
        Cell start = Cell.C8;
        Cell dest = Cell.H3;
        BishopBlack bishop = new BishopBlack(start);
        Cell[] expected = {Cell.D7, Cell.E6, Cell.F5, Cell.G4, Cell.H3};
        assertArrayEquals(expected, bishop.way(dest));
    }

    @Test
    public void whenDiagonalIsTrue() {
        Cell start = Cell.C8;
        Cell dest = Cell.H3;
        BishopBlack bishop = new BishopBlack(start);
        assertTrue(bishop.isDiagonal(start, dest));
    }

    @Test
    public void whenDiagonalIsFalse() {
        Cell start = Cell.C8;
        Cell dest = Cell.H2;
        BishopBlack bishop = new BishopBlack(start);
        assertFalse(bishop.isDiagonal(start, dest));
    }
}
