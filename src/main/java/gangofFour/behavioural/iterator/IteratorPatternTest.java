package gangofFour.behavioural.iterator;

/**
 * Created by nguyen on 10/12/2016.
 */
public class IteratorPatternTest {

  public static void main(String[] args) {
    IChannelCollection channels = populateChannels();
    IChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);
    while (baseIterator.hasNext()) {
      Channel c = baseIterator.next();
      System.out.println(c.toString());
    }
    System.out.println("******");
    // Channel Type Iterator
    IChannelIterator englishIterator = channels.iterator(ChannelTypeEnum.ENGLISH);
    while (englishIterator.hasNext()) {
      Channel c = englishIterator.next();
      System.out.println(c.toString());
    }
  }

  private static IChannelCollection populateChannels() {
    IChannelCollection channels = new ChannelCollectionImpl();
    channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
    channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
    channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
    channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
    channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
    channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
    channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
    channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
    channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
    return channels;
  }

  /**
   * Iterator Design Pattern in JDK
   We all know that Collection framework Iterator is the best example of iterator pattern implementation but
   do you know that java.util.Scanner class also Implements Iterator interface.
   Read this post to learn about Java Scanner Class.
   * */

}
