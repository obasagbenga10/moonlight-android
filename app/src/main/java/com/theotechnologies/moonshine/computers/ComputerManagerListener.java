package com.theotechnologies.moonshine.computers;

import com.theotechnologies.moonshine.nvstream.http.ComputerDetails;

public interface ComputerManagerListener {
    void notifyComputerUpdated(ComputerDetails details);
}
