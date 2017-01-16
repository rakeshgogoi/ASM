package digitalaxom.asm.view;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Heerok on 16-01-2017.
 */
public class Batch {

    private String status;

    private String filename;

    private String comments;

    private List<BatchResult> results = new LinkedList<>();

    private boolean dryrun;

    public void addResult(BatchResult result) {
        results.add(result);
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<BatchResult> getResults() {
        return results;
    }

    public void setResults(List<BatchResult> results) {
        this.results = results;
    }

    public boolean isDryrun() {
        return dryrun;
    }

    public void setDryrun(boolean dryrun) {
        this.dryrun = dryrun;
    }
}
