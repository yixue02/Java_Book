/*
 *  Copyright 2011 Rapleaf
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package chapter23.extras;

//import chapter23.lightweight_trie-master.lightweight_trie-master.src.java.com.rapleaf.lightweight_trie.*;
import java.util.Iterator;

final class KeySetIterator<V> implements Iterator<String> {
  private final EntrySetIterator<V> iterator;

  public KeySetIterator(AbstractNode<V> root) {
    iterator = new EntrySetIterator<V>(root);
  }

  @Override
  public boolean hasNext() {
    return iterator.hasNext();
  }

  @Override
  public String next() {
    return iterator.next().getKey();
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}