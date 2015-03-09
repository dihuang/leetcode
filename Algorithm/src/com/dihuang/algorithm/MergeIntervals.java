package com.dihuang.algorithm;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

public List<Interval> merge(List<Interval> intervals) {
	if(intervals == null || intervals.isEmpty()){
		return intervals;
	}
	Collections.sort(intervals, new Comparator<Interval>() {
		@Override
		public int compare(Interval i1,Interval i2){
			return Integer.compare(i1.start, i2.start);
		}
	});
	List<Interval> result = new LinkedList<Interval>();
    int start = intervals.get(0).start;
    int end = intervals.get(0).end;

    for (Interval interval : intervals) {
        if (interval.start <= end) // Overlapping intervals, move the end if needed
            end = Math.max(end, interval.end);
        else {                     // Disjoint intervals, add the previous one and reset bounds
            result.add(new Interval(start, end));
            start = interval.start;
            end = interval.end;
        }
    }

    // Add the last interval
    result.add(new Interval(start, end));
    return result;
    }
}
