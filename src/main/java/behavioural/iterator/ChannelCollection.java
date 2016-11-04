package behavioural.iterator;

/**
 * Created by nguyen on 10/11/2016.
 */
public interface ChannelCollection {

    public void addChannel(Channel c);

    public void removeChannel(Channel c);

    public ChannelIterator iterator(ChannelTypeEnum type);
}
