package fr.ubo.fast.performance.intervals;

/**
 * Interface for computing time intervals used by the FaST framework to optimize the pre-computation of Min-Max tables across various zoom levels.
 * These intervals typically represent duration-to-value ratios, and are selected to balance query performance and storage cost in time series visualization.
 */
public interface IntervalSelection
{
	/**
	 * Compute and select a set of optimal intervals (zoom level durations divided by number of values) needed for Min-Max table pre-computation in the FaST framework.
	 */
	public void computeIntervals();
}
