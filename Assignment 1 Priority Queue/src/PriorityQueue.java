
public class PriorityQueue {
	Student[] studentData ;
	private int size;
	private int head;
	private int tail;

	//constructor to create priority queue with default length of 10
	public PriorityQueue() {
		this(10);
	}

	//constructor to create priority queue with user specified length
	public PriorityQueue(int length) {
		studentData = new Student[length];
		this.head=-1;
		this.tail=-1;
		this.size=0;
	}

	void enqueue(Student newStudent) {

		if(size==0) {
			head=0; //set head as the starting point of the studentData array
		}
		if(size==studentData.length) {
			increaseQueueCapacity();
		}
		tail++;
		size++;
		studentData[tail]= newStudent;
	}

	void dequeue() {
		if(size==0) {
			System.out.println("Queue already empty!");
		}
		studentData[head] = null;
		head++;//move head to point to next element
		size--;//reduce size
	}

	int size() {
		return size;
	}

	void printQueue() {
		if(size==0)
			System.out.println("Queue is empty!");
		for(int i=head;i<size;i++) {
			System.out.println(i);
			System.out.println(studentData[i].getName());
			System.out.println(studentData[i].getRedid());
		}
	}

	//return highest priority element
	Student getFirtElement() {
		return studentData[head];
	}
	
	private int setPriority(Student newStudent) {
		int priority=0;
		//logic to decide priority of object

		return priority;

	}
	
	private void increaseQueueCapacity() {
		// double capacity of queue
		Student[] oldStudentData = studentData;
		studentData = new Student[2*oldStudentData.length];
		//copy over old data to new queue
		
	}
}
