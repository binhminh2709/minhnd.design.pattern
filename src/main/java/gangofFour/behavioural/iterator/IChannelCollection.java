package gangofFour.behavioural.iterator;

/**
 * Created by nguyen on 10/11/2016.
 */
public interface IChannelCollection {

  public void addChannel(Channel c);

  public void removeChannel(Channel c);

  public IChannelIterator iterator(ChannelTypeEnum type);
}
