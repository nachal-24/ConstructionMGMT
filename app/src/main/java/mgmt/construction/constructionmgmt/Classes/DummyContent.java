package mgmt.construction.constructionmgmt.Classes;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

   /* private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }*/

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem  {
        public final String id;
        public final String content;
        public final String details;


        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;

           // this.sid=id;
            //this.scontent=content;
           // this.sdetails=details;
        }

        @Override
        public String toString() {
            return content;
        }
      /*  public DummyItem(Parcel in) {
            super();
            readFromParcel(in);
        }

        public static final Parcelable.Creator<DummyItem> CREATOR = new Parcelable.Creator<DummyItem>() {
            public DummyItem createFromParcel(Parcel in) {
                return new DummyItem(in);
            }

            public DummyItem[] newArray(int size) {

                return new DummyItem[size];
            }

        };

        public void readFromParcel(Parcel in) {
            this.sid = in.readString();
            this.scontent = in.readString();
            this.sdetails = in.readString();

        }
        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.sid);
            dest.writeString(this.scontent);
            dest.writeString(this.sdetails);
        }*/
    }
}
