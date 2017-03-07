package us.bojie.dribbbleapp.view.bucket_list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import us.bojie.dribbbleapp.R;
import us.bojie.dribbbleapp.view.base.BaseViewHolder;

public class BucketViewHolder extends BaseViewHolder {

    @BindView(R.id.bucket_layout)
    View bucketLayout;
    @BindView(R.id.bucket_name)
    TextView bucketName;
    @BindView(R.id.bucket_shot_count)
    TextView bucketCount;
    @BindView(R.id.bucket_shot_chosen)
    ImageView bucketChosen;

    public BucketViewHolder(View itemView) {
        super(itemView);
    }
}
