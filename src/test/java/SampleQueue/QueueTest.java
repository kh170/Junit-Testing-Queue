package SampleQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class QueueTest {

	/**
	 * Tests for Queue.
	 */

	public static final String SOME_ITEM = "some-content";
	public Queue<String> q;
	public Queue<String> p;

	// Testing constructors
	@BeforeEach
	void init() {
		this.q = new Queue<String>();
		this.p = new Queue<String>(1);
	}

	// Testing enqueue()
	@Test
	@DisplayName("Throws exception when max length exceeded")
	void enqueueThrowsErrorWhenMaxLengthExceeded() {
		p.enqueue(SOME_ITEM);
		assertThrows(RuntimeException.class, () -> p.enqueue(SOME_ITEM));
	}

	@Test
	@DisplayName("Adds the first element when queue empty")
	void enqueueAddsFirstElementIfPreviouslyEmpty() {
		assertTrue(q.isEmpty());
		q.enqueue(SOME_ITEM);
		assertFalse(q.isEmpty());
		assertEquals(1, q.length());
		assertEquals(q.dequeue(), SOME_ITEM);
		assertEquals(0, q.length());
		assertTrue(q.isEmpty());
	}

	@Test
	@DisplayName("Adds the last element when queue previously not empty")
	void enqueueAddsLastElementIfPreviouslyNotEmpty() {
		q.enqueue(SOME_ITEM);
		assertFalse(q.isEmpty());
		q.enqueue(SOME_ITEM + SOME_ITEM);
		assertEquals(2, q.length());
		q.dequeue();
		assertEquals(1, q.length());
		assertEquals(q.peek(), SOME_ITEM + SOME_ITEM);
	}

	// Testing dequeue()

	@Test
	@DisplayName("RemoveAll should show isEmpty() as True")
	void dequeueThrowsNoSuchElementExceptionWhenAppliedOnNonEmptyQueue() {
		assertThrows(NoSuchElementException.class,()->this.q.dequeue());
	}

	@Test
	@DisplayName("Dequeue should remove elements from the Queue")
	void dequeueRemoveElementsFromQueue() {
	q.enqueue(SOME_ITEM);
		assertFalse(q.isEmpty());
		q.enqueue(SOME_ITEM + SOME_ITEM);
		assertEquals(2, q.length());
		q.dequeue();
		assertEquals(1, q.length());
		
	}

	//Testing peek()	
	@Test
	@DisplayName("Peek should throw an Exception if called on empty queue")
	void peekThrowsExceptionOnEmpty() {
		assertThrows(NoSuchElementException.class, () -> this.q.peek());
	}

	@Test
	@DisplayName("Peek should show the first item of non-empty queue but remains not empty")
	void peekShowFirstItemForNonEmptyQueue() {
		q.enqueue(SOME_ITEM);
		assertEquals(SOME_ITEM, q.peek());
	}

	//Testing size() 
	@Test
	@DisplayName("Size should show the number of items in a queue")
	void sizeShowsNumberOfItemsInQueue() {
		q.enqueue(SOME_ITEM);
		assertEquals(1, q.size());
	}

	//Testing length()
	@Test
	@DisplayName("Length should show the number of items in a queue")
	void lengthShowsNumberOfItemsInQueue() {
		q.enqueue(SOME_ITEM);
		assertEquals(1, q.length());
	}

	// Testing isEmpty()
	@Test
	@DisplayName("Verify Queue isEmpty when queue is initialized")
	void isEmptyShouldGiveTrueOnQueueInit() {
		assertTrue(q.isEmpty());
	}

	
	//Testing removeAll()
	@Test
	@DisplayName("RemoveAll should show isEmpty() as True")
	void removeAllItemsOfQueue() {
		q.enqueue(SOME_ITEM);
		q.removeAll();
		assertTrue(q.isEmpty());
	}

	
}